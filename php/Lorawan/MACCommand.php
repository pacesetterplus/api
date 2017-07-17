<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>lorawan.MACCommand</code>
 */
class MACCommand extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>uint32 cid = 1;</code>
     */
    private $cid = 0;
    /**
     * <code>bytes payload = 2;</code>
     */
    private $payload = '';

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * <code>uint32 cid = 1;</code>
     */
    public function getCid()
    {
        return $this->cid;
    }

    /**
     * <code>uint32 cid = 1;</code>
     */
    public function setCid($var)
    {
        GPBUtil::checkUint32($var);
        $this->cid = $var;
    }

    /**
     * <code>bytes payload = 2;</code>
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * <code>bytes payload = 2;</code>
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;
    }

}
