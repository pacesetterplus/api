<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * DryUplinkResult is the result from an uplink simulation
 * </pre>
 *
 * Protobuf type <code>handler.DryUplinkResult</code>
 */
class DryUplinkResult extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The binary payload
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    private $payload = '';
    /**
     * <pre>
     * The decoded fields
     * </pre>
     *
     * <code>string fields = 2;</code>
     */
    private $fields = '';
    /**
     * <pre>
     * Was validation of the message successful
     * </pre>
     *
     * <code>bool valid = 3;</code>
     */
    private $valid = false;
    /**
     * <pre>
     * Logs that have been generated while processing
     * </pre>
     *
     * <code>repeated .handler.LogEntry logs = 4;</code>
     */
    private $logs;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The binary payload
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * <pre>
     * The binary payload
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;
    }

    /**
     * <pre>
     * The decoded fields
     * </pre>
     *
     * <code>string fields = 2;</code>
     */
    public function getFields()
    {
        return $this->fields;
    }

    /**
     * <pre>
     * The decoded fields
     * </pre>
     *
     * <code>string fields = 2;</code>
     */
    public function setFields($var)
    {
        GPBUtil::checkString($var, True);
        $this->fields = $var;
    }

    /**
     * <pre>
     * Was validation of the message successful
     * </pre>
     *
     * <code>bool valid = 3;</code>
     */
    public function getValid()
    {
        return $this->valid;
    }

    /**
     * <pre>
     * Was validation of the message successful
     * </pre>
     *
     * <code>bool valid = 3;</code>
     */
    public function setValid($var)
    {
        GPBUtil::checkBool($var);
        $this->valid = $var;
    }

    /**
     * <pre>
     * Logs that have been generated while processing
     * </pre>
     *
     * <code>repeated .handler.LogEntry logs = 4;</code>
     */
    public function getLogs()
    {
        return $this->logs;
    }

    /**
     * <pre>
     * Logs that have been generated while processing
     * </pre>
     *
     * <code>repeated .handler.LogEntry logs = 4;</code>
     */
    public function setLogs(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Handler\LogEntry::class);
        $this->logs = $arr;
    }

}
