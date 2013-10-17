package geometry;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;

public final class Geometry extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("Geometry Succesfully Loaded!");
	}

	@Override
	public void onDisable()
	{
		getLogger().info("Geometry Succesfully Unloaded!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("encase"))
		{
			return Commands.encase(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("cuboid"))
		{
			return Commands.cuboid(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("pyramid"))
		{
			return Commands.pyramid(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("sphere"))
		{
			return Commands.sphere(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("tunnel"))
		{
			return Commands.tunnel(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("cone"))
		{
			return Commands.cone(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("cylinder"))
		{
			return Commands.cylinder(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("pyramid2"))
		{
			return Commands.pyramid2(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("square"))
		{
			return Commands.square(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("rectangle"))
		{
			return Commands.rectangle(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("cube"))
		{
			return Commands.cube(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("circle"))
		{
			return Commands.circle(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("octahedron"))
		{
			return Commands.octahedron(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("ellipsoid"))
		{
			return Commands.ellipsoid(sender, cmd, label, args);
		}
		else if (cmd.getName().equalsIgnoreCase("ellipse"))
		{
			return Commands.ellipse(sender, cmd, label, args);
		}

		// If this hasn't happened, then a value of false will be returned.
		return false;
	}
}