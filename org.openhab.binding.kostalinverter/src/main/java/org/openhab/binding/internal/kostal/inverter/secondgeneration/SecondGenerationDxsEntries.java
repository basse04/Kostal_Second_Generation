/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.internal.kostal.inverter.secondgeneration;

/**
 * @author Örjan Backsell - Initial contribution Piko1020, Piko New Generation
 */
public class SecondGenerationDxsEntries {
    private String dxsId;
    private String value;

    public String getId() {
        return dxsId;
    }

    public String getName() {
        return value;
    }
}
