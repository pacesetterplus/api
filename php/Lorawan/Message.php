<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>lorawan.Message</code>
 */
class Message extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    private $m_hdr = null;
    /**
     * Generated from protobuf field <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     */
    private $mic = '';
    protected $Payload;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Lorawan\MHDR $m_hdr
     *     @type string $mic
     *     @type \Lorawan\MACPayload $mac_payload
     *     @type \Lorawan\JoinRequestPayload $join_request_payload
     *     @type \Lorawan\JoinAcceptPayload $join_accept_payload
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     * @return \Lorawan\MHDR
     */
    public function getMHdr()
    {
        return $this->m_hdr;
    }

    /**
     * Generated from protobuf field <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     * @param \Lorawan\MHDR $var
     * @return $this
     */
    public function setMHdr($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\MHDR::class);
        $this->m_hdr = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     * @return string
     */
    public function getMic()
    {
        return $this->mic;
    }

    /**
     * Generated from protobuf field <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     * @param string $var
     * @return $this
     */
    public function setMic($var)
    {
        GPBUtil::checkString($var, False);
        $this->mic = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.MACPayload mac_payload = 3 [(.gogoproto.customname) = "MACPayload"];</code>
     * @return \Lorawan\MACPayload
     */
    public function getMacPayload()
    {
        return $this->readOneof(3);
    }

    /**
     * Generated from protobuf field <code>.lorawan.MACPayload mac_payload = 3 [(.gogoproto.customname) = "MACPayload"];</code>
     * @param \Lorawan\MACPayload $var
     * @return $this
     */
    public function setMacPayload($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\MACPayload::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
     * @return \Lorawan\JoinRequestPayload
     */
    public function getJoinRequestPayload()
    {
        return $this->readOneof(4);
    }

    /**
     * Generated from protobuf field <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
     * @param \Lorawan\JoinRequestPayload $var
     * @return $this
     */
    public function setJoinRequestPayload($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\JoinRequestPayload::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
     * @return \Lorawan\JoinAcceptPayload
     */
    public function getJoinAcceptPayload()
    {
        return $this->readOneof(5);
    }

    /**
     * Generated from protobuf field <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
     * @param \Lorawan\JoinAcceptPayload $var
     * @return $this
     */
    public function setJoinAcceptPayload($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\JoinAcceptPayload::class);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getPayload()
    {
        return $this->whichOneof("Payload");
    }

}

