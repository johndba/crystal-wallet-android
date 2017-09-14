package cy.agorise.crystalwallet.enums;

import java.io.Serializable;

/**
 * Created by Henry Varona on 12/9/2017.
 */

public enum CryptoCoin implements Serializable {
    BITCOIN(CryptoNet.BITCOIN,"BTC",8),
    BITCOIN_TEST(CryptoNet.BITCOIN_TEST,"BTC",8),
    LITECOIN(CryptoNet.LITECOIN,"LTC",8),
    DASH(CryptoNet.DASH,"DASH",8),
    DOGECOIN(CryptoNet.DOGECOIN,"DOGE",8),
    BITSHARES(CryptoNet.BITSHARES,"BTS",8);

    protected CryptoNet cryptoNet;
    protected String label;
    protected int precision;

    CryptoCoin(CryptoNet cryptoNet, String label, int precision){
        this.cryptoNet = cryptoNet;
        this.label = label;
        this.precision = precision;

    }

    public CryptoNet getCryptoNet(){
        return this.cryptoNet;
    }
    public String getLabel(){
        return this.label;
    }
    public int getPrecision(){
        return this.precision;
    }

}
