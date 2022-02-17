package practicaCookies;
import java.io.*;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class PaginaPersonalServlet extends HttpServlet {
  public static String getName(HttpServletRequest request) {
    String name = null;
    name = getCookieValue("nom", request);
    if (name == null) {
      name = "sense valor: nom";
    }

    return name;
  }

  public static String getCognom(HttpServletRequest request) {
    String cognom = null;
    cognom = getCookieValue("cognom", request);
    if (cognom == null) {
      cognom = "sense valor: cognom";
    }

    return cognom;
  }

  public static String getColor(HttpServletRequest request) {
    String color = null;
    color = getCookieValue("color", request);
    if (color == null) {
      color = "sense valor: color";
    }

    return color;
  }

  public static String getSport(HttpServletRequest request) {
    String sport = null;
    sport = getCookieValue("sport", request);
    if (sport == null) {
      sport = "sense valor: sport";
    }

    return sport;
  }

  public static String getImage(HttpServletRequest request) {
    String sport = null;
    String img = null;
    sport = getCookieValue("sport", request);
    //TODO: bucle per retornar la imatge associada a l’sport passat

    for(int i = 0; i < sports.size(); i++){
      if(sports.get(i).key.equals(sport)){
        img = sports.get(i).image;
      }
    }
    return img;
  }

  public static String getSportsman(HttpServletRequest request) {
    String sport = null;
    String img = null;
    sport = getCookieValue("sport", request);
    //TODO: bucle per retornar la imatge associada a l’sport passat

    for(int i = 0; i < sports.size(); i++){
      if(sports.get(i).key.equals(sport)){
        img = sports.get(i).name;
      }
    }
    return img;
  }


  private static String getCookieValue(String cookie, HttpServletRequest request) {
    Cookie[] cookies = request.getCookies();

    String value = null;

    // TODO: bucle per retornar el valor de la cookie passada (DONE)
    for (int i = 0; i < cookies.length; i++){

        if (cookies[i].getName().equals(cookie)){
            value = cookies[i].getValue();
        }
    }
    return value;
}



  public static ArrayList<Sport> getList() {
      ArrayList<Sport> sports = new ArrayList<Sport>();

      sports.add(new Sport("Tenis", "Rafael Nadal Parera", "https://es.wikipedia.org/wiki/Rafael_Nadal#/media/Archivo:Rafael_Nadal_(12054444625)_(cropped).jpg"));
      sports.add(new Sport("Futbol", "Romario de Souza Faria", "https://es.wikipedia.org/wiki/Rom%C3%A1rio#/media/Archivo:Posse_Senadores_2019_(33077513788)_(cropped).jpg"));
      sports.add(new Sport("Basket", "Kareem Abdul-Jabbar", "https://es.wikipedia.org/wiki/Kareem_Abdul-Jabbar#/media/Archivo:Kareem_Abdul-Jabbar_May_2014.jpg"));

      return sports;
  }



  private static class Sport {
      private String name, key, image;
      private Sport(String key, String name, String image) {
          this.key = key;
          this.name = name;
          this.image = image;
      }
  }
}











package practicaCookies;
import java.io.*;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class PaginaPersonalServlet extends HttpServlet {
  public static String getName(HttpServletRequest request) {
    String name = null;
    name = getCookieValue("nom", request);
    if (name == null) {
      name = "sense valor: nom";
    }

    return name;
  }

  public static String getCognom(HttpServletRequest request) {
    String cognom = null;
    cognom = getCookieValue("cognom", request);
    if (cognom == null) {
      cognom = "sense valor: cognom";
    }

    return cognom;
  }

  public static String getColor(HttpServletRequest request) {
    String color = null;
    color = getCookieValue("color", request);
    if (color == null) {
      color = "sense valor: color";
    }

    return color;
  }

  public static String getSport(HttpServletRequest request) {
    String sport = null;
    sport = getCookieValue("sport", request);
    if (sport == null) {
      sport = "sense valor: sport";
    }

    return sport;
  }

  public static String getImage(HttpServletRequest request) {
    String sport = null;
    String img = null;
 
    //TODO: bucle per retornar la imatge associada a l’sport passat
    ArrayList<Sport> sports = getList();
    sport = getCookieValue("sport", request);

    for(int i = 0; i < sports.size(); i++){
      if(sports.get(i).key.equals(sport)){
        img = sports.get(i).image;
      }
    }
    return img;
  }


  public static String getSportsman(HttpServletRequest request) {
    String sport = null;
    String img = null;
 
    //TODO: bucle per retornar la imatge associada a l’sport passat
    ArrayList<Sport> sports = getList();
    sport = getCookieValue("sport", request);

    for(int i = 0; i < sports.size(); i++){
      if(sports.get(i).key.equals(sport)){
        img = sports.get(i).name;
      }
    }
    return img;
  }


  private static String getCookieValue(String cookie, HttpServletRequest request) {
    Cookie[] cookies = request.getCookies();

    String value = null;

    // TODO: bucle per retornar el valor de la cookie passada (DONE)
    for (int i = 0; i < cookies.length; i++){

        if (cookies[i].getName().equals(cookie)){
            value = cookies[i].getValue();
        }
    }
    return value;
}



  public static ArrayList<Sport> getList() {
      ArrayList<Sport> sports = new ArrayList<Sport>();

      sports.add(new Sport("Tenis", "Rafael Nadal Parera", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Rafael_Nadal_%2812054444625%29_%28cropped%29.jpg/800px-Rafael_Nadal_%2812054444625%29_%28cropped%29.jpg"));
      sports.add(new Sport("Futbol", "Romario de Souza Faria", "https://upload.wikimedia.org/wikipedia/commons/f/f5/Posse_Senadores_2019_%2833077513788%29_%28cropped%29.jpg"));
      sports.add(new Sport("Basket", "Kareem Abdul-Jabbar", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Kareem_Abdul-Jabbar_May_2014.jpg/800px-Kareem_Abdul-Jabbar_May_2014.jpg"));

      return sports;
  }



  private static class Sport {
      private String name, key, image;
      private Sport(String key, String name, String image) {
          this.key = key;
          this.name = name;
          this.image = image;
      }
  }
}