package fabrick.appFabrick.model;


import org.apache.logging.log4j.message.StringFormattedMessage;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Bonifico {

    //private Long accountid;
    private String receiverName;
    private String description;
    private String currency;
    private String amount;
    private String executionData;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "conto_id", nullable = false, foreignKey = @ForeignKey(name = "fk_conto_id"))
    private Conto conto;

    //private List<Bonifico> bonifici= new LinkedList<>();

    public Bonifico(){
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExecutionData() {
        return executionData;
    }

    public void setExecutionData(String executionData) {
        this.executionData = executionData;
    }

    @Override
    public String toString() {
        return "Bonifico{" +
                "receiverName='" + receiverName + '\'' +
                ", description='" + description + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", executionData='" + executionData + '\'' +
                ", conto=" + conto +
                '}';
    }
}
