package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="Transaction")
public class Transaction implements Serializable {
    @Id
    @Column(name = "transact_id", nullable = false)
    private Long transact_id;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "descript", length = 30)
    private String descript;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "transaction_transact_id")
    private Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getTransact_id() {
        return transact_id;
    }

    public void setTransact_id(Long transact_id) {
        this.transact_id = transact_id;
    }
}
