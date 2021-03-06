package cy.agorise.crystalwallet.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import cy.agorise.crystalwallet.dao.converters.Converters;
import cy.agorise.crystalwallet.enums.CryptoNet;

/**
 * Represents each currency in transaction and balances
 *
 * Created by henry Henry Varona on 11/9/2017.
 */
@Entity(tableName="crypto_currency",
        indices = {@Index(value = {"crypto_net","name"}, unique=true)})
public class CryptoCurrency {

    /**
     * The id on the database
     */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long mId;

    /**
     * The name or tag of this currency
     */
    @ColumnInfo(name = "name")
    private String mName;

    /**
     * CryptoCoin network where this currency belongs to
     */
    @ColumnInfo(name = "crypto_net")
    @TypeConverters(Converters.class)
    private CryptoNet mCryptoNet;


    /**
     * The decimal point
     */
    @ColumnInfo(name = "precision")
    private int mPrecision;

    public long getId() {
        return mId;
    }

    public void setId(long mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public CryptoNet getCryptoNet() {
        return mCryptoNet;
    }

    public void setCryptoNet(CryptoNet cryptoNet) {
        this.mCryptoNet = cryptoNet;
    }

    public int getPrecision() {
        return mPrecision;
    }

    public void setPrecision(int precision) {
        this.mPrecision = precision;
    }
}
