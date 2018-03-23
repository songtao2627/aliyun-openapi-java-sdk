/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryAliasesResponse;
import com.aliyuncs.push.model.v20160801.QueryAliasesResponse.AliasInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAliasesResponseUnmarshaller {

	public static QueryAliasesResponse unmarshall(QueryAliasesResponse queryAliasesResponse, UnmarshallerContext context) {
		
		queryAliasesResponse.setRequestId(context.stringValue("QueryAliasesResponse.RequestId"));

		List<AliasInfo> aliasInfos = new ArrayList<AliasInfo>();
		for (int i = 0; i < context.lengthValue("QueryAliasesResponse.AliasInfos.Length"); i++) {
			AliasInfo aliasInfo = new AliasInfo();
			aliasInfo.setAliasName(context.stringValue("QueryAliasesResponse.AliasInfos["+ i +"].AliasName"));

			aliasInfos.add(aliasInfo);
		}
		queryAliasesResponse.setAliasInfos(aliasInfos);
	 
	 	return queryAliasesResponse;
	}
}