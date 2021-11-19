/*******************************************************************************
 * Copyright (c) 2021, 2021 Red Hat, IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.autotune.analyzer.experiments;

import java.util.ArrayList;

public class ExperimentTrial {
    private final String experimentId;
    private final String namespace;
    private final String applicationName;
    private final String appVersion;
    private final TrialInfo trialInfo;
    private final ExperimentSettings experimentSettings;
    private final ArrayList<Deployments> deployments;

    public ExperimentTrial(String experimentId,
                           String namespace,
                           String applicationName,
                           String appVersion,
                           TrialInfo trialInfo,
                           ExperimentSettings experimentSettings,
                           ArrayList<Deployments> deployments) {
        this.experimentId = experimentId;
        this.namespace = namespace;
        this.applicationName = applicationName;
        this.appVersion = appVersion;
        this.trialInfo = trialInfo;
        this.experimentSettings = experimentSettings;
        this.deployments = deployments;
    }

    public String getExperimentId() {
        return experimentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public TrialInfo getTrialInfo() {
        return trialInfo;
    }

    public ExperimentSettings getExperimentSettings() {
        return experimentSettings;
    }

    public ArrayList<Deployments> getDeployments() {
        return deployments;
    }
}