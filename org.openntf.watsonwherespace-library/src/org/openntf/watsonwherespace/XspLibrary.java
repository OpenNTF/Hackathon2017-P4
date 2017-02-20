package org.openntf.watsonwherespace;


import com.ibm.xsp.library.AbstractXspLibrary;

public class XspLibrary extends AbstractXspLibrary {

	public XspLibrary() {
		System.out.println("Loading Watson Wherespace library");
	}

	@Override
	public String getPluginId() {
		return Activator.PLUGIN_ID;
	}

	@Override
	public String getLibraryId() {
		return XspLibrary.class.getName();
	}

	@Override
	public String[] getDependencies() {
		return new String[] { "com.ibm.xsp.core.library", "com.ibm.xsp.extsn.library", "com.ibm.xsp.domino.library",
				"com.ibm.xsp.designer.library" };
	}

	@Override
	public String[] getXspConfigFiles() {
		final String[] files = new String[] { "META-INF/openntf-watsonwherespace.xsp-config" };

		return files;
	}

	@Override
	public String[] getFacesConfigFiles() {
		final String[] files = new String[] { "META-INF/openntf-watsonwherespace-faces-config.xml" };
		return files;
	}

}
