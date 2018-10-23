package com.yhq.platform.entity;
import java.math.BigDecimal;
/**
 * Created by yanghuiqing on 2018/10/22.
 */
public class DespositParms {
    //<amount>,<block_hash> ,<chain>,<block_height>, <confirm_times>, <currency>,<extr>, <from_address>,
    // <from_address_tag> ,<request_id>,<to_address>,<to_address_tag>,<tx_hash>,<type>,<vout_index>
    private BigDecimal amount;
    private String chain;
    private String currency;
    private int block_height;
    private String block_hash;
    private int confirm_times;
    private String  extr;
    private String from_address;
    private String from_address_tag;
    private String request_id;
    private String to_address;
    private String to_address_tag;
    private String tx_hash;
    private String type;
    private int vote_index;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBlock_height() {
        return block_height;
    }

    public void setBlock_height(int block_height) {
        this.block_height = block_height;
    }

    public String getBlock_hash() {
        return block_hash;
    }

    public void setBlock_hash(String block_hash) {
        this.block_hash = block_hash;
    }

    public int getConfirm_times() {
        return confirm_times;
    }

    public void setConfirm_times(int confirm_times) {
        this.confirm_times = confirm_times;
    }

    public String getExtr() {
        return extr;
    }

    public void setExtr(String extr) {
        this.extr = extr;
    }

    public String getFrom_address() {
        return from_address;
    }

    public void setFrom_address(String from_address) {
        this.from_address = from_address;
    }

    public String getFrom_address_tag() {
        return from_address_tag;
    }

    public void setFrom_address_tag(String from_address_tag) {
        this.from_address_tag = from_address_tag;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }

    public String getTo_address_tag() {
        return to_address_tag;
    }

    public void setTo_address_tag(String to_address_tag) {
        this.to_address_tag = to_address_tag;
    }

    public String getTx_hash() {
        return tx_hash;
    }

    public void setTx_hash(String tx_hash) {
        this.tx_hash = tx_hash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVote_index() {
        return vote_index;
    }

    public void setVote_index(int vote_index) {
        this.vote_index = vote_index;
    }
}
