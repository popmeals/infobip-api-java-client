package infobip.api.model.nc.logs;

import java.util.Date;
import infobip.api.model.Price;
import infobip.api.model.Status;
import infobip.api.model.Error;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextLog {
    private String bulkId;
    private String messageId;
    private String to;
    private Date sentAt;
    private Date doneAt;
    private String mccMnc;
    private Price price;
    private Status status;
    private Error error;

    public NumberContextLog() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public NumberContextLog setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public NumberContextLog setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public NumberContextLog setTo(String to) {
        this.to = to;
        return this;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public NumberContextLog setSentAt(Date sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public Date getDoneAt() {
        return this.doneAt;
    }

    public NumberContextLog setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public NumberContextLog setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public NumberContextLog setPrice(Price price) {
        this.price = price;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public NumberContextLog setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Error getError() {
        return this.error;
    }

    public NumberContextLog setError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        NumberContextLog o = (NumberContextLog)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.messageId == null) {
            if (o.messageId != null){
                return false;
            }
        } else if (!this.messageId.equals(o.messageId)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.sentAt == null) {
            if (o.sentAt != null){
                return false;
            }
        } else if (!this.sentAt.equals(o.sentAt)) {
            return false;
        }
        if (this.doneAt == null) {
            if (o.doneAt != null){
                return false;
            }
        } else if (!this.doneAt.equals(o.doneAt)) {
            return false;
        }
        if (this.mccMnc == null) {
            if (o.mccMnc != null){
                return false;
            }
        } else if (!this.mccMnc.equals(o.mccMnc)) {
            return false;
        }
        if (this.price == null) {
            if (o.price != null){
                return false;
            }
        } else if (!this.price.equals(o.price)) {
            return false;
        }
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }
        if (this.error == null) {
            if (o.error != null){
                return false;
            }
        } else if (!this.error.equals(o.error)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextLog{" +
            "bulkId='" + bulkId + "'" +
            ", messageId='" + messageId + "'" +
            ", to='" + to + "'" +
            ", sentAt='" + sentAt + "'" +
            ", doneAt='" + doneAt + "'" +
            ", mccMnc='" + mccMnc + "'" +
            ", price='" + price + "'" +
            ", status='" + status + "'" +
            ", error='" + error + "'" +
            '}';
    }
}