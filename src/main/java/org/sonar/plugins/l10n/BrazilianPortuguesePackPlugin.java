/*
 * L10n :: Brazilian Portuguese Pack
 * Copyright (C) 2012 Fundação CPqD
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.l10n;

import org.sonar.api.SonarPlugin;

import java.util.Collections;
import java.util.List;

/**
 * Entry point for the brazilian portuguese pack plugin
 */
public final class BrazilianPortuguesePackPlugin extends SonarPlugin {

  /**
   * Retrieves the extensions included in the plugin. As it is language pack no 
   * extension is required. 
   */
  public List getExtensions() {
    return Collections.emptyList();
  }
}