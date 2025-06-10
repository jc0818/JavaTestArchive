package Character;

public class Skill {
	private String sSkillName;
	private int iSkillAtk;
	private String sSkillProperty;
	
	public Skill(String sSkillName, int iSkillAtk, String sSkillProperty)
	{
		this.sSkillName = sSkillName;
		this.iSkillAtk = iSkillAtk;
		this.sSkillProperty = sSkillProperty;
	}
	
	public int getiSkillAtk() {
		return iSkillAtk;
	}
	
	public String getsSkillName() {
		return sSkillName;
	}
	
	public String getType() {
		return sSkillProperty;
	}
	@Override
	public String toString() {
	    return sSkillName + " (" + sSkillProperty + ", " + iSkillAtk + ")";
	}
	
}
