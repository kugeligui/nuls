package io.nuls.db.entity;

public class PeerGroupPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_group.hid
     *
     * @mbg.generated
     */
    private Integer hid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_group.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column peer_group.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_group.hid
     *
     * @return the value of peer_group.hid
     *
     * @mbg.generated
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_group.hid
     *
     * @param hid the value for peer_group.hid
     *
     * @mbg.generated
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_group.name
     *
     * @return the value of peer_group.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_group.name
     *
     * @param name the value for peer_group.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column peer_group.version
     *
     * @return the value of peer_group.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column peer_group.version
     *
     * @param version the value for peer_group.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}