package sho.playground.generic;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name = "Playground", immediate = true)
public class Playground
{
	private static final Logger LOG = LoggerFactory.getLogger(Playground.class.getName());

	@Activate
	private void activate()
	{
		testRegExPatterns();
	}

	private void testRegExPatterns()
	{
		LOG.info("Starting testing Java RegEx Patterns ...");
	}
}
