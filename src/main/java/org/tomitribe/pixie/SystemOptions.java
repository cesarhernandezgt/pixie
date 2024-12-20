/*
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
package org.tomitribe.pixie;

import org.tomitribe.pixie.comp.Default;
import org.tomitribe.pixie.comp.Option;

public class SystemOptions {

    private final boolean debug;
    private final boolean more;

    private SystemOptions(
            @Option("debug") @Default("false") final boolean debug,
            @Option("more") @Default("false") final boolean more) {
        this.debug = debug;
        this.more = more;
    }

    public boolean isDebug() {
        return debug;
    }

    public boolean isMore() {
        return more;
    }
}
