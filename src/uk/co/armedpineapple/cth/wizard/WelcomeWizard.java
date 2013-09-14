/*
 *   Copyright (C) 2012 Alan Woolley
 *   
 *   See LICENSE.TXT for full license
 */
package uk.co.armedpineapple.cth.wizard;

import uk.co.armedpineapple.cth.Configuration;
import uk.co.armedpineapple.cth.Configuration.ConfigurationException;
import android.content.Context;
import android.util.AttributeSet;

public class WelcomeWizard extends WizardView {

	public WelcomeWizard(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public WelcomeWizard(Context context, AttributeSet attrs) {
		super(context, attrs);

	}

	public WelcomeWizard(Context context) {
		super(context);

	}

	@Override
	void saveConfiguration(Configuration config) throws ConfigurationException {

	}

	@Override
	void loadConfiguration(Configuration config) {

	}

}
