package sho.playground.generic;

import java.util.regex.Pattern;

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

		String regex = "/services/find\\?MM_OMNFIND_ID=cmis\\&(\\S*)";
		String toMatch =
			"/services/find?MM_OMNFIND_ID=cmis&query=+Artikelbilder&searchField=RNC_IDENTIFIER&filterdiscriminator=FIL~~~DOC~~~MS~~~PDF~~~PRS~~~PS~~~IMG~~~VID&page=1&productsPerPage=100";
		// String toMatch = "/services/find?MM_OMNFIND_ID=cmis&test";
		boolean matches = Pattern.matches(regex, toMatch);
		System.out.println("Pattern matches: " + matches);
	}
}
