package com.hsbc.caller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;



public class Caller extends BodyTagSupport{
	
	
	String query;
	String database;
	String username;
	String password;
	
	
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the database
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * @param database the database to set
	 */
	public void setDatabase(String database) {
		this.database = database;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int doStartTag() throws JspException {
		
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\RUPALI TRIPATHI\\MyDB;create=true");	 
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			pageContext.getOut().print(" <form action=\"ProductQuote2.java\" method=\"GET\"> <table> <tr> <th> Product List </th> > <th> Product Category </th> <th><th> Product Quantity </th> <th> ");
			 while(rs.next())
			 {
				/* pageContext.getOut().print("<tr> <td>  <input type=\"checkbox\" id=\"1\" name=\"extraProductsList\" value=\"\">\r\n" + 
				 		"                    <label for =\"extraProductsList\">" + rs.getString(4)+"</label> </td></tr>");
				 
				 
				  * pageContext.getOut().print("<tr> <td>  <input type=\"checkbox\" id=\"rs.getString(4)\" name=\"extraProductsList\" value=\"\">\r\n" + 
				 		"                    <label for =\"extraProductsList\">" + rs.getString(4)+"</label> </td></tr>");
				  * */
				String s=rs.getString(4)+",";
				
				 pageContext.getOut().print("<tr> <td>  <input type=\"checkbox\" id="+rs.getString(4)+" name=\"extraProductsList\" value="+rs.getString(4)+">\r\n" + 
					 		"                    <label for =\"extraProductsList\">" + rs.getString(4)+"</label> </td><td><select id=\"categoryList\" name=\"categoryList\">\r\n" + 
					 				"      <option value="+rs.getString(4)+">"+ rs.getString(4)+"</option>\r\n" + 
					 				"       <option value="+rs.getString(4)+">"+ rs.getString(4)+"</option>\r\\n" +
					 				"      <option value="+rs.getString(4)+">"+ rs.getString(4)+"</option>\\r\\n" +
					 				
					 				"    </select></td><td><label for=\"quantity\"></label>\r\n" + 
					 				"<input type=\"number\" id=\"quantity\" name=\"quantity\" min=\"1\" max=\"1000\"><td></tr>");
				
//				 pageContext.getOut().print("<tr> <td> " + crs.getInt(1) + " </td> <td> " + crs.getString(2) + " </td>  <td> " + crs.getString(3) + " </td> <td> " + crs.getInt(4) + " </td> <td> " + crs.getInt(5) + " </td> <td> " + crs.getInt(6) + " </td></tr>");
				 
			 }
			 pageContext.getOut().print(" <tr>\r\n" + 
			 		"                  <td>\r\n" + 
			 		"                    <input type = \"submit\" value = \"Compute Costs\" />\r\n" + 
			 		"                  </td>\r\n" + 
			 		"                </tr>");
			 pageContext.getOut().print("</table></form>");
			 con.close();
		  }
		
				catch (IOException e) 
				{
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		return EVAL_PAGE;
			 
		}
		
		
	
	
	@Override
	public int doEndTag() throws JspException {
		
		return super.doEndTag();
	}

}
