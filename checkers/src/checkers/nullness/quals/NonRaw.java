package checkers.nullness.quals;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import checkers.initialization.quals.Unclassified;
import checkers.nullness.NullnessRawnessChecker;
import checkers.quals.DefaultQualifierInHierarchy;
import checkers.quals.SubtypeOf;
import checkers.quals.TypeQualifier;

/**
 * This type qualifier belongs to the rawness initialization tracking
 * type-system. This type-system is not used on its own, but in conjunction with
 * some other type-system that wants to ensure safe initialization. For
 * instance, {@link NullnessRawnessChecker} uses rawness to track initialization
 * of {@link NonNull} fields.
 *
 * <p>
 * This type qualifier indicates that the object has been fully initialized;
 * reading fields from such objects is fully safe and yields objects of the
 * correct type.
 */
@Documented
@TypeQualifier
@DefaultQualifierInHierarchy
@SubtypeOf(Unclassified.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
public @interface NonRaw {
}
