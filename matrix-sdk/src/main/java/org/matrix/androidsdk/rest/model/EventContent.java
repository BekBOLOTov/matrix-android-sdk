/*
 * Copyright 2014 OpenMarket Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.matrix.androidsdk.rest.model;

import org.matrix.androidsdk.rest.model.pid.RoomThirdPartyInvite;

/**
 * Class representing an event content
 */
public class EventContent implements java.io.Serializable {
    /**
     * The display name for this user, if any.
     */
    public String displayname;

    /**
     * The avatar URL for this user, if any. T
     */
    public String avatar_url;

    /**
     * The membership state of the user. One of: ["invite", "join", "knock", "leave", "ban"]
     */
    public String membership;

    /**
     * the third party invite
     */
    public RoomThirdPartyInvite third_party_invite;

    /*
     * e2e encryption format
    */
    public String algorithm;
}