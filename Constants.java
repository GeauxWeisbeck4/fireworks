// ----------------------------------------------------------
// Program Name:        Constants.java
// Course:              CS1302 T-R NIGHT
// Student Name:        David Rodgers
// Assignment Number:   Project 6
// Due Date:            November 29, 2007
// ----------------------------------------------------------
// PROGRAM CONSTANTS AND NOTES
// ----------------------------------------------------------

package Fireworks.src;

public class Constants {
    // ----------------------------------------------------------
    // CHANGE LOG
    // ----------------------------------------------------------
    // DR :: 11-27-07 ::  2:30pm :: Updated Applet Explosion Bounds, Random XY Explosion Position, Random FChoice
    // DR :: 11-27-07 :: 10:41pm :: Commented Code, Fixed Frame, Enabled Gravity, Updated Console Info
    // DR :: 11-27-07 :: 12:56pm :: Updated explosion area constraints, Error Handling, File Names
    // FireworksSystem for explosions.  Added the use of FIREWORKS_GRAVITY and PARTICLE_GRAVITY to Firework
    // and Particle classes respectively
    // DR :: 11-29-07 ::  2:14am :: Added color patterns, tweaked physics
    // DR :: 11-29-07 ::  1:15pm :: Updated Comments, Combined Code from Charles v.06
    // DR :: 11-29-07 :: 5:29pm :: Changed screen res, fixed firework launch angle, tweaked physics
    public static String VERSION_NUM = "v1.0";

    // Controls how much gravity effects fireworks
    public static final float FIREWORKS_GRAVITY = 0.04 f;

    // Controls how much gravity effects particles
    public static final float PARTICLE_GRAVITY = 0.03 f;

    // Set refresh rate (value in milliseconds)
    public static final int REFRESH_RATE = 20;

    // Particle Size (Need to make random or slider in GUI)
    public static final int PARTICLE_SIZE = 3;

    // Particle Size (Need to make random or slider in GUI)
    public static final int FIREWORKS_SIZE = 4;

    // ----------------------------------------------------------
    // IDEAS
    // ----------------------------------------------------------
    // Multiple explosions
    // Fully configurable firework displays by passing values
    // City background
    // Explosion sound
}