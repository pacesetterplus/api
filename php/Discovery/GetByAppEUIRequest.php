<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/discovery/discovery.proto

namespace Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>discovery.GetByAppEUIRequest</code>
 */
class GetByAppEUIRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    private $app_eui = '';

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Discovery\Discovery::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * <pre>
     * compatible with Metadata message
     * </pre>
     *
     * <code>bytes app_eui = 31 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI"];</code>
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;
    }

}
