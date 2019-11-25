using Strategy.Behaviour;
using Strategy.Interfaces;

namespace Strategy.Models
{
    public abstract class Mage
    {
        public string Name { get; set; }

        protected ISpellCastingBehaviour castSpellBehaviour;

        protected IMoveBehaviour moveBehaviour;

        public Mage()
        {
            castSpellBehaviour = new FireBallSpellBehaviour();
            moveBehaviour = new MoveBehaviour();
        }

        public void SetCastSpellBehaviour(ISpellCastingBehaviour spellBehaviour)
        {
            castSpellBehaviour = spellBehaviour;
        }

        public void SetMoveBehaviour(IMoveBehaviour moveBehaviour)
        {
            this.moveBehaviour = moveBehaviour;
        }

        public void CastSpell()
        {
            castSpellBehaviour.CastSpell();
        }

        public void Move()
        {
            moveBehaviour.Move();
        }
    }
}
