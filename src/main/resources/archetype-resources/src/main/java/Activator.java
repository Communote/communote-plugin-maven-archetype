package ${package};

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The activator allows the implementation of functions
 * which will be called at the bundle activation and deactivation time.
 * This class is optional and you can delete this file if there no use for it.
 * 
 * @author you
 * 
 */
public class Activator implements BundleActivator {

    private static Logger LOGGER = LoggerFactory.getLogger(Activator.class);

    @Override
    public void start(BundleContext context) throws Exception {
        LOGGER.info("Starting - Communote plugin: {}", context.getBundle().getSymbolicName());
        // TODO: Add your routines for initialization here
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        LOGGER.info("Stopping - Communote plugin: {}", context.getBundle().getSymbolicName());
        // TODO: Add your routines for initialization here
    }

}
