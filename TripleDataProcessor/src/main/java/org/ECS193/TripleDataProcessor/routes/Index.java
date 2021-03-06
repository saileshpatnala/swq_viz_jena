package org.ECS193.TripleDataProcessor.routes;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

@Path("index")
public class Index {
	
	private String indexFilePath = "src/main/webapp/index.html";

	@GET
	@Produces({MediaType.TEXT_HTML})
	public InputStream viewIndex()
	{
		try {
			File f = new File(this.indexFilePath);
			return new FileInputStream(f);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}