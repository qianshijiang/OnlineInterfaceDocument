package com.cn.interfacedocument.entity;

public class TypicalCase {
    private Long id;

    private String anhao;

    private String title;

    private String neirong;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnhao() {
        return anhao;
    }

    public void setAnhao(String anhao) {
        this.anhao = anhao == null ? null : anhao.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}