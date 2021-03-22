package com.example.warhammer.data.character

class Skill {

    var skillName: String
    var skillLevel: Int

        constructor(skillName: String, skillLevel: Int)
        {
            this.skillName = skillName
            this.skillLevel = skillLevel
        }
        constructor(skillName: String)
        {
        this.skillName = skillName
        this.skillLevel = SkillLevel.standard
        }
}