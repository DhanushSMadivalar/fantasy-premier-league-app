package com.pl.premier_league.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Players")
public class Player {

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getCrdR() {
        return crdR;
    }

    public void setCrdR(Double crdR) {
        this.crdR = crdR;
    }

    public Double getCrdY() {
        return crdY;
    }

    public void setCrdY(Double crdY) {
        this.crdY = crdY;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    @Id
    private ObjectId id;         // Maps to MongoDB _id

    @Field("Age")
    private Integer age;

    @Field("Ast")
    private Double ast;

    @Field("CrdR")
    private Double crdR;

    @Field("CrdY")
    private Double crdY;

    @Field("Gls")
    private Double gls;

    @Field("Min")
    private Double min;

    @Field("MP")
    private Integer mp;

    @Field("Nation")
    private String nation;

    @Field("PK")
    private Double pk;

    @Field("Player")
    private String player;

    @Field("Pos")
    private String pos;

    @Field("Starts")
    private Integer starts;

    @Field("Team")
    private String team;

    @Field("xAG")
    private Double xag;

    @Field("xG")
    private Double xg;

    public Player() {
    }

    public Player(ObjectId id, Integer age, Double ast, Double crdR, Double crdY, Double gls, Double min, Integer mp, String nation, Double pk, String player, String pos, Integer starts, String team, Double xag, Double xg) {
        this.id = id;
        this.age = age;
        this.ast = ast;
        this.crdR = crdR;
        this.crdY = crdY;
        this.gls = gls;
        this.min = min;
        this.mp = mp;
        this.nation = nation;
        this.pk = pk;
        this.player = player;
        this.pos = pos;
        this.starts = starts;
        this.team = team;
        this.xag = xag;
        this.xg = xg;
    }

    public Player(String player) {
        this.player = player;
    }
}
