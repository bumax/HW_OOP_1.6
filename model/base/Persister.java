package model.base;

public abstract class Persister{
	/***
	 * Сохранение
	 * @param user Пользователь
	 * @return При успешном сохранении возвращаем 0, при ошибке -1
	 */
	public abstract int save(BaseUser user);

}