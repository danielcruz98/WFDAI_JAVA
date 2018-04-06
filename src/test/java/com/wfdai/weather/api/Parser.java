package com.wfdai.weather.api;

public class Parser {
    String parsedMessage;

public Parser() {}


public String getParsedMessage() {
    return parsedMessage;
}


    
    public void setParser(Weather weather){
    parsedMessage=    
            "    }\n    }\n  ]\n}"
+ "{\n"
            + "  \"content-spec\": \"urn:spec://eclipse.org/unide/measurement-message#v2\",\n"
            + "  \"device\": {\n    \"deviceID\": \"servidorjava\"\n  },\n"
            + "  \"measurements\": [\n"
            + "    {\n"
            + "      \"ts\": \""+ weather.dataDados +"\",\n"
            + "      \"series\": {\n"
            + "        \"$_time\": [ 0 ],\n"
            + "        \"DirecaoVento\": [ " + weather.getDirecaoVento()+ " ],\n"
            + "        \"VelocidadeVento\": [ " + weather.getVelocidadeVento()+ " ],\n"
            + "        \"Temperatura\": [ " + weather.getTemperatura()+ " ],\n"
            + "        \"Pressao\": [ " + weather.getPressao()+ " ],\n"
            + "        \"Humidade\": [ " + weather.getHumidade()+ " ],\n"
            + "        \"Visibilidade\": [ " + weather.getVisibilidade()+ " ],\n"
            + "        \"NascerSol\": [ " + weather.getNascerSol()+ " ],\n"
            + "        \"PorSol\": [ " + weather.getPorSol()+ " ],\n"
            + "        \"Tempo\": [ " + weather.getTempo()+ " ],\n"
            + "      }\n    }\n  ]\n}\"";
    }
}
