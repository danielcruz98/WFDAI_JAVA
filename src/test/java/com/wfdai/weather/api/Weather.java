package com.wfdai.weather.api;

import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;
import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import java.util.Date;

public class Weather {
    //inicializar variaveis
    int direcaoVento;
    float velocidadeVento;
    int temperatura;
    float pressao;
    Date dataDados;
    int humidade;
    float visibilidade;
    String nascerSol;
    String porSol;
    String tempo;
    //construtor
    public Weather() {
    }
    public void setWeather(String localizacao) throws JAXBException, IOException {
        YahooWeatherService service = new YahooWeatherService();
        List<Channel> channel;
        channel = service.getForecastForLocation(localizacao, DegreeUnit.CELSIUS).first(1);
        this.direcaoVento=channel.get(0).wind.getDirection();
        this.velocidadeVento=channel.get(0).wind.getSpeed();
        this.temperatura=channel.get(0).item.getCondition().getTemp();
        this.pressao=channel.get(0).atmosphere.getPressure();
        this.dataDados=channel.get(0).item.getPubDate();
        this.humidade=channel.get(0).atmosphere.getHumidity();
        this.visibilidade=channel.get(0).atmosphere.getVisibility();
        this.nascerSol=channel.get(0).astronomy.getSunrise().toString();
        this.porSol=channel.get(0).astronomy.getSunset().toString();
        this.tempo=channel.get(0).item.getCondition().getText();   
    }
   
    

    public int getDirecaoVento() {
        return direcaoVento;
    }

    public float getVelocidadeVento() {
        return velocidadeVento;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public float getPressao() {
        return pressao;
    }

    public Date getDataDados() {
        return dataDados;
    }

    public int getHumidade() {
        return humidade;
    }

    public float getVisibilidade() {
        return visibilidade;
    }

    public String getNascerSol() {
        return nascerSol;
    }

    public String getPorSol() {
        return porSol;
    }

    public String getTempo() {
        return tempo;
    }
    
}