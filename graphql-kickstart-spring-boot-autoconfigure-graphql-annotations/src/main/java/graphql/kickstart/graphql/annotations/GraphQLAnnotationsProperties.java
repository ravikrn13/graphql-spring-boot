package graphql.kickstart.graphql.annotations;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
@ConfigurationProperties(prefix = "graphql.annotations")
public class GraphQLAnnotationsProperties {

  /**
   * The base package where GraphQL definitions (resolvers, types etc.) are searched for.
   */
  private @NotBlank String basePackage;

  /**
   * Set if fields should be globally prettified (removes get/set/is prefixes from names). Defaults
   * to true.
   */
  @Builder.Default
  private boolean alwaysPrettify = true;

  /**
   * If set to <code>true</code> abstract classes implementing a GraphQL interface will not be added to the schema.
   * Defaults to <code>false</code> for backward compatibility.
   */
  @Builder.Default
  private boolean ignoreAbstractInterfaceImplementations = false;
}
