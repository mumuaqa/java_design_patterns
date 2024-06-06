import java.util.ArrayList;
import java.util.List;

public class ComputerPart {

}

    interface Component {//组件，有功能展示价格

        void showPrice();
    }

    class Leaf implements Component {//叶子节点
        int price;
        String name;

        public Leaf(int price, String name) {
            this.price = price;
            this.name = name;
        }

        @Override
        public void showPrice() {
            System.out.println(name + ":" + price);
        }
    }

    class Composite implements Component {//复合体，多个叶子组成的

        public Composite(String name) {
            this.name = name;
        }

        List<Component> components = new ArrayList<>();
        String name;

        public void addComponnt(Component com) {
            components.add(com);
        }

        @Override
        public void showPrice() {
            System.out.println(name);
            for (Component c : components) {
                c.showPrice();
            }
        }
    }
