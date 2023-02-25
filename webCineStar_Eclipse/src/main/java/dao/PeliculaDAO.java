package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import bean.Pelicula;

public class PeliculaDAO {

	db.Db db = new db.Db("cinestar");

	public Object getPeliculas(int idx, boolean bLista) {
		db.Sentencia( String.format("call sp_getPeliculas(%s)", idx) );
		String [][] mRegistros= db.getRegistros();
		if(mRegistros==null) return null;
		if (!bLista) return mRegistros;
		List<Pelicula> lstPeliculas = new ArrayList<>();
		for(String[] aRegistro: mRegistros)
			lstPeliculas.add(new Pelicula (aRegistro));
		return lstPeliculas;
	}

	public Object getPelicula(String id, boolean bEntidad ) {
		db.Sentencia( String.format("call sp_getPelicula(%s)", id) );
		String [] aRegistro= db.getRegistro();
		if(aRegistro==null) return null;
		if (!bEntidad) return aRegistro;
		aRegistro[2]= new SimpleDateFormat("EEEE dd 'de' MMMMM 'de' yyyy").format(new Date(aRegistro[2]));
		db.Sentencia( String.format("select getGenerosDetalle('%s')", aRegistro[4]) );
		aRegistro[4]=db.getCampo();
		return new Pelicula (aRegistro);
	}

}
