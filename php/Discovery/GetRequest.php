<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * The identifier of the service that should be returned
 * </pre>
 *
 * Protobuf type <code>discovery.GetRequest</code>
 */
class GetRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The ID of the service
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    private $id = '';
    /**
     * <pre>
     * The name of the service (router/broker/handler)
     * </pre>
     *
     * <code>string service_name = 2;</code>
     */
    private $service_name = '';

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Discovery\Discovery::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The ID of the service
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * <pre>
     * The ID of the service
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;
    }

    /**
     * <pre>
     * The name of the service (router/broker/handler)
     * </pre>
     *
     * <code>string service_name = 2;</code>
     */
    public function getServiceName()
    {
        return $this->service_name;
    }

    /**
     * <pre>
     * The name of the service (router/broker/handler)
     * </pre>
     *
     * <code>string service_name = 2;</code>
     */
    public function setServiceName($var)
    {
        GPBUtil::checkString($var, True);
        $this->service_name = $var;
    }

}
