package eu.happycoders.jep418;

import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

public class HappyCodersInetAddressResolverProvider extends InetAddressResolverProvider {
  @Override
  public InetAddressResolver get(Configuration configuration) {
    return new HappyCodersInetAddressResolver();
  }

  @Override
  public String name() {
    return "HappyCoders Internet Address Resolver Provider";
  }
}
