/**
 * Copyright © 2016-2018 The Thingsboard Authors
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
package org.thingsboard.server.extensions.api.plugins.ws.msg;

import org.thingsboard.server.extensions.api.plugins.PluginApiCallSecurityContext;
import org.thingsboard.server.extensions.api.plugins.msg.ToPluginActorMsg;
import org.thingsboard.server.extensions.api.plugins.ws.PluginWebsocketSessionRef;

import java.io.Serializable;

public interface PluginWebsocketMsg<T> extends ToPluginActorMsg, Serializable {

    PluginWebsocketSessionRef getSessionRef();

    T getPayload();

    PluginApiCallSecurityContext getSecurityCtx();
}
