package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import  java.time.LocalDate;

@Entity
@Table(name="exchangedM")
public class exchangedM implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exchanged_m_id", nullable = false)
    private Long exchangedM_ID;

    @Column(name = "type", length = 30)
    private String type;

    @Column(name = "descr", length = 30)
    private String descr;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "member_member_id")
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getExchangedM_ID() {
        return exchangedM_ID;
    }

    public void setExchangedM_ID(Long exchangedM_ID) {
        this.exchangedM_ID = exchangedM_ID;
    }
}
