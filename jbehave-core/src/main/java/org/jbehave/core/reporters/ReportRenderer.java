package org.jbehave.core.reporters;

import java.io.File;
import java.util.List;
import java.util.Properties;

/**
 * A report renderer is responsible for creating a collective view of file-based
 * outputs generated by the reporters. The renderer assumes all reporter outputs have
 * been generated to the output directory in the formats specified. 
 */
public interface ReportRenderer {

    void render(File outputDirectory, List<String> formats, Properties renderingResources);

	int countScenarios();

	int countFailedScenarios();
}
