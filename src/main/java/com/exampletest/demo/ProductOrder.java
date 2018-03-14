package com.exampletest.demo;

import javax.persistence.*;

@Entity
public class ProductOrder {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String title;
    private String content;


    //오더에 멤버가 들어감
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }




    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




}
