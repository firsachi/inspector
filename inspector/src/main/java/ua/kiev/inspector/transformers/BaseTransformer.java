package ua.kiev.inspector.transformers;

public interface BaseTransformer<E, M> {

	public M entityToModel(E entity);
	public E modelToEntity(M model);
}
