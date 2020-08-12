package creational.Builder;

import org.junit.Assert;
import org.junit.Test;

import creational.Builder.Character.Ability;
import creational.Builder.Character.Clan;
import creational.Builder.Costume.Armor;
import creational.Builder.Weapon.WeaponKind;


public class BuilderTest {

	
	
	@Test
	public void testBuilder() {
		Character fairy = new Character().builder()
				.withName("Hanna")
				.withAge(20)
				.withClan(Clan.Fairy)
				.withAbility(Ability.Speed)
				.custome().isCamouflaged(true)
						  .withArmor(Armor.Low)
						  .withColor("purple")
						  .weapon()
						  .withKindOfWeapon(WeaponKind.Sword)
						  .withName("sword Z")
						  .build();
		System.out.println(fairy.toString());
		Assert.assertNotNull(fairy.toString());
		
	}
	
	
}
