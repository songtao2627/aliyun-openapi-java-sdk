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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteTasksRequest extends RpcAcsRequest<DeleteTasksResponse> {
	
	public DeleteTasksRequest() {
		super("Cms", "2018-03-08", "DeleteTasks", "cms");
	}

	private Integer isDeleteAlarms;

	private String taskIds;

	public Integer getIsDeleteAlarms() {
		return this.isDeleteAlarms;
	}

	public void setIsDeleteAlarms(Integer isDeleteAlarms) {
		this.isDeleteAlarms = isDeleteAlarms;
		if(isDeleteAlarms != null){
			putQueryParameter("IsDeleteAlarms", isDeleteAlarms.toString());
		}
	}

	public String getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(String taskIds) {
		this.taskIds = taskIds;
		if(taskIds != null){
			putQueryParameter("TaskIds", taskIds);
		}
	}

	@Override
	public Class<DeleteTasksResponse> getResponseClass() {
		return DeleteTasksResponse.class;
	}

}
