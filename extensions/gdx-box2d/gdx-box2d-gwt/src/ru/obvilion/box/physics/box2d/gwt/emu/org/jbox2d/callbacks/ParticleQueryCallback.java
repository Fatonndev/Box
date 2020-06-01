package ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.callbacks;

import ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.dynamics.World;
import ru.obvilion.box.physics.box2d.gwt.emu.org.jbox2d.collision.AABB;

/**
 * Callback class for AABB queries. See
 * {@link World#queryAABB(QueryCallback, AABB)}.
 * 
 * @author dmurph
 * 
 */
public interface ParticleQueryCallback {
  /**
   * Called for each particle found in the query AABB.
   * 
   * @return false to terminate the query.
   */
  boolean reportParticle(int index);
}
