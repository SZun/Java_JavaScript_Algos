class Item {
  private cost: number;
  private price: number;
  private inventory: number;

  constructor(cost: number, price: number, inventory: number) {
    this.cost = cost;
    this.price = price;
    this.inventory = inventory;
  }

  getProfit(): number {
    return Math.round((this.price - this.cost) * this.inventory);
  }
}

const main = () => {
  const prompt = "Profit is: ";

  console.log(prompt + new Item(32.67, 45.0, 1200).getProfit());
  console.log(prompt + new Item(225.89, 550.0, 100).getProfit());
  console.log(prompt + new Item(2.77, 7.95, 8500).getProfit());
};

main();
