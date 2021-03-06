<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * SimulatedUplinkMessage is a simulated uplink message
 *
 * Generated from protobuf message <code>handler.SimulatedUplinkMessage</code>
 */
class SimulatedUplinkMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     */
    private $app_id = '';
    /**
     * Generated from protobuf field <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     */
    private $dev_id = '';
    /**
     * The binary payload to use
     *
     * Generated from protobuf field <code>bytes payload = 3;</code>
     */
    private $payload = '';
    /**
     * The port number
     *
     * Generated from protobuf field <code>uint32 port = 4;</code>
     */
    private $port = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $app_id
     *     @type string $dev_id
     *     @type string $payload
     *           The binary payload to use
     *     @type int $port
     *           The port number
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     * @return string
     */
    public function getAppId()
    {
        return $this->app_id;
    }

    /**
     * Generated from protobuf field <code>string app_id = 1 [(.gogoproto.customname) = "AppID"];</code>
     * @param string $var
     * @return $this
     */
    public function setAppId($var)
    {
        GPBUtil::checkString($var, True);
        $this->app_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     * @return string
     */
    public function getDevId()
    {
        return $this->dev_id;
    }

    /**
     * Generated from protobuf field <code>string dev_id = 2 [(.gogoproto.customname) = "DevID"];</code>
     * @param string $var
     * @return $this
     */
    public function setDevId($var)
    {
        GPBUtil::checkString($var, True);
        $this->dev_id = $var;

        return $this;
    }

    /**
     * The binary payload to use
     *
     * Generated from protobuf field <code>bytes payload = 3;</code>
     * @return string
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * The binary payload to use
     *
     * Generated from protobuf field <code>bytes payload = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;

        return $this;
    }

    /**
     * The port number
     *
     * Generated from protobuf field <code>uint32 port = 4;</code>
     * @return int
     */
    public function getPort()
    {
        return $this->port;
    }

    /**
     * The port number
     *
     * Generated from protobuf field <code>uint32 port = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setPort($var)
    {
        GPBUtil::checkUint32($var);
        $this->port = $var;

        return $this;
    }

}

