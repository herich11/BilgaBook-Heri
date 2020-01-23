package com.heridev.bilgabook.dummy;

import com.heridev.bilgabook.R;
import com.heridev.bilgabook.models.Book;

import java.util.ArrayList;

public class BookDummy {
    /*
     * 0: Photo
     * 1: Title
     * 2: Subtitle
     * 3: Author
     * 4: Hardcover
     * 5: Publisher
     * 6: Language
     * 7: ISBN-10
     * 8: ISBN-13
     * 9: Dimension
     * 10: Weight
     * 11: Review
     */


    private static String[][] data = new String[][] {
            {
                    "book_a.jpg",
                    "Life 3.0",
                    "Being Human in the Age of Artificial Intelligence",
                    "Max Tegmark",
                    "384 pages",
                    "Knopf (August 29, 2017)",
                    "English",
                    "1101946598",
                    "978-1101946596",
                    "6.7 x 1.3 x 9.5 inches",
                    "1.3 pounds",
                    "New York Times Best Seller\n\n" +
                            "How will Artificial Intelligence affect crime, war, justice, jobs, society and our very sense of being human? The rise of AI has the potential to transform our future more than any other technology—and there’s nobody better qualified or situated to explore that future than Max Tegmark, an MIT professor who’s helped mainstream research on how to keep AI beneficial.\n\n" +
                            "How can we grow our prosperity through automation without leaving people lacking income or purpose? What career advice should we give today’s kids? How can we make future AI systems more robust, so that they do what we want without crashing, malfunctioning or getting hacked? Should we fear an arms race in lethal autonomous weapons? Will machines eventually outsmart us at all tasks, replacing humans on the job market and perhaps altogether? Will AI help life flourish like never before or give us more power than we can handle?\n\n" +
                            "What sort of future do you want? This book empowers you to join what may be the most important conversation of our time. It doesn’t shy away from the full range of viewpoints or from the most controversial issues—from superintelligence to meaning, consciousness and the ultimate physical limits on life in the cosmos.\n"
            },
            {
                    "book_b.jpg",
                    "Should We Eat Meat ?",
                    "Evolution and Consequences of Modern Carnivory",
                    "Vaclav Smil",
                    "276 pages",
                    "Willey-Blackwell; 1 edition (May 28, 2013)",
                    "English",
                    "9781118278727",
                    "978-111827727",
                    "6 x 0.6 x 8.9 inches",
                    "1 pounds",
                    "Meat eating is often a contentious subject, whether considering the technical, ethical, environmental, political, or health-related aspects of production and consumption.\n\n"+
                            "This book is a wide-ranging and interdisciplinary examination and critique of meat consumption by humans, throughout their evolution and around the world. Setting the scene with a chapter on meat’s role in human evolution and its growing influence during the development of agricultural practices, the book goes on to examine modern production systems, their efficiencies, outputs, and impacts. The major global trends of meat consumption are described in order to find out what part its consumption plays in changing modern diets in countries around the world. The heart of the book addresses the consequences of the \"massive carnivory\" of western diets, looking at the inefficiencies of production and at the huge impacts on land, water, and the atmosphere. Health impacts are also covered, both positive and negative. In conclusion, the author looks forward at his vision of “rational meat eating”, where environmental and health impacts are reduced, animals are treated more humanely, and alternative sources of protein make a higher contribution.\n\n" +
                    "Should We Eat Meat? is not an ideological tract for or against carnivorousness but rather a careful evaluation of meat's roles in human diets and the environmental and health consequences of its production and consumption. It will be of interest to a wide readership including professionals and academics in food and agricultural production, human health and nutrition, environmental science, and regulatory and policy making bodies around the world.\n"
            },
            {
                    "book_c.jpg",
                    "I Contain Multitudes",
                    "The Microbes Within Uss and a Grander View of Life",
                    "Ed Yong",
                    "368 pages",
                    "Ecco, 1 edition (August 9, 2016)",
                    "English",
                    "0062368591",
                    "978-0062368591",
                    "1.2 x 5.9 x 8.8 inches",
                    "1.2 pounds",
                    "Joining the ranks of popular science classics like The Botany of Desire and The Selfish Gene, a groundbreaking, wondrously informative, and vastly entertaining examination of the most significant revolution in biology since Darwin—a “microbe’s-eye view” of the world that reveals a marvelous, radically reconceived picture of life on earth.\n\n"+
                            "Every animal, whether human, squid, or wasp, is home to millions of bacteria and other microbes. Ed Yong, whose humor is as evident as his erudition, prompts us to look at ourselves and our animal companions in a new light—less as individuals and more as the interconnected, interdependent multitudes we assuredly are.\n\n" +
                            "The microbes in our bodies are part of our immune systems and protect us from disease. In the deep oceans, mysterious creatures without mouths or guts depend on microbes for all their energy. Bacteria provide squid with invisibility cloaks, help beetles to bring down forests, and allow worms to cause diseases that afflict millions of people.\n\n" +
                            "Many people think of microbes as germs to be eradicated, but those that live with us—the microbiome—build our bodies, protect our health, shape our identities, and grant us incredible abilities. In this astonishing book, Ed Yong takes us on a grand tour through our microbial partners, and introduces us to the scientists on the front lines of discovery. It will change both our view of nature and our sense of where we belong in it.\n"
            },
            {
                    "book_d.jpg",
                    "The Emperor of All Maladies",
                    "A Biography of Cancer",
                    "Siddhartha Mukherjee",
                    "592 Pages",
                    "Scribner, 1 edition (November 16, 2010)",
                    "English",
                    "9781439107959",
                    "978-1439107959",
                    "6.1 x 1.6 x 9.2 inches",
                    "1.9 pounds",
                    "The Emperor of All Maladies is a magnificent, profoundly humane “biography” of cancer—from its first documented appearances thousands of years ago through the epic battles in the twentieth century to cure, control, and conquer it to a radical new understanding of its essence.\n\n" +
                            "Physician, researcher, and award-winning science writer, Siddhartha Mukherjee examines cancer with a cellular biologist’s precision, a historian’s perspective, and a biographer’s passion. The result is an astonishingly lucid and eloquent chronicle of a disease humans have lived with—and perished from—for more than five thousand years.\n\n" +
                            "The story of cancer is a story of human ingenuity, resilience, and perseverance, but also of hubris, paternalism, and misperception. Mukherjee recounts centuries of discoveries, setbacks, victories, and deaths, told through the eyes of his predecessors and peers, training their wits against an infinitely resourceful adversary that, just three decades ago, was thought to be easily vanquished in an all-out (\"war against cancer\").\n\n" +
                            "The book reads like a literary thriller with cancer as the protagonist. From the Persian Queen Atossa, whose Greek slave cut off her malignant breast, to the nineteenth-century recipients of primitive radiation and chemotherapy to Mukherjee’s own leukemia patient, Carla, The Emperor of All Maladies is about the people who have soldiered through fiercely demanding regimens in order to survive—and to increase our understanding of this iconic disease.\n\n" +
                            "Riveting, urgent, and surprising, The Emperor of All Maladies provides a fascinating glimpse into the future of cancer treatments. It is an illuminating book that provides hope and clarity to those seeking to demystify cancer.\n"
            },
            {
                    "book_e.jpg",
                    "Behind the Beautiful Forevers",
                    "Life, Death, and Hope in a Mumbai Undercity",
                    "Katherine Boo",
                    "256 pages",
                    "Random House, 1st edition (February 7, 2012)",
                    "English",
                    "9781400067558",
                    "978-1400067558",
                    "6.5 x 1.1 x 9.5 inches",
                    "1.2 pounds",
                    "In this brilliant, breathtaking book by Pulitzer Prize winner Katherine Boo, a bewildering age of global change and inequality is made human through the dramatic story of families striving toward a better life in Annawadi, a makeshift settlement in the shadow of luxury hotels near the Mumbai airport.\n\n" +
                            "As India starts to prosper, the residents of Annawadi are electric with hope. Abdul, an enterprising teenager, sees “a fortune beyond counting” in the recyclable garbage that richer people throw away. Meanwhile Asha, a woman of formidable ambition, has identified a shadier route to the middle class. With a little luck, her beautiful daughter, Annawadi’s “most-everything girl,” might become its first female college graduate. And even the poorest children, like the young thief Kalu, feel themselves inching closer to their dreams. But then Abdul is falsely accused in a shocking tragedy; terror and global recession rock the city; and suppressed tensions over religion, caste, sex, power, and economic envy turn brutal.\n\n"+
                            "With intelligence, humor, and deep insight into what connects people to one another in an era of tumultuous change, Behind the Beautiful Forevers, based on years of uncompromising reporting, carries the reader headlong into one of the twenty-first century’s hidden worlds—and into the hearts of families impossible to forget."
            },
            {
                    "book_f.jpg",
                    "Homo Deus",
                    "A Brief History of Tomorrow",
                    "Yuval Noah Harari",
                    "464 pages",
                    "Harper, 1st edition (February 21, 2017)",
                    "English",
                    "1910701882",
                    "978-0062464316",
                    "9.3 x 6.2 x 1.6 inches",
                    "2.2 pounds",
                    "New York Times Best Seller",
                    "Yuval Noah Harari, author of the critically-acclaimed New York Times bestseller and international phenomenon Sapiens, returns with an equally original, compelling, and provocative book, turning his focus toward humanity’s future, and our quest to upgrade humans into gods.\n\n" +
                            "Over the past century humankind has managed to do the impossible and rein in famine, plague, and war. This may seem hard to accept, but, as Harari explains in his trademark style—thorough, yet riveting—famine, plague and war have been transformed from incomprehensible and uncontrollable forces of nature into manageable challenges. For the first time ever, more people die from eating too much than from eating too little; more people die from old age than from infectious diseases; and more people commit suicide than are killed by soldiers, terrorists and criminals put together. The average American is a thousand times more likely to die from binging at McDonalds than from being blown up by Al Qaeda.\n\n"+
                            "What then will replace famine, plague, and war at the top of the human agenda? As the self-made gods of planet earth, what destinies will we set ourselves, and which quests will we undertake? Homo Deus explores the projects, dreams and nightmares that will shape the twenty-first century—from overcoming death to creating artificial life. It asks the fundamental questions: Where do we go from here? And how will we protect this fragile world from our own destructive powers? This is the next stage of evolution. This is Homo Deus.\n\n"+
                            "With the same insight and clarity that made Sapiens an international hit and a New York Times bestseller, Harari maps out our future.\n"
            },
            {
                    "book_g.jpg",
                    "Enlightenment Now",
                    "The Case for Reason, Science, Humanism, and Progress",
                    "Steven Pinker",
                    "576 pages",
                    "Viking, 1st edition (February 13, 2018)",
                    "English",
                    "9780525427575",
                    "978-0525427575",
                    "6.3 x 1.8 x 9.5 inches",
                    "1.8 pounds",
                    "Instant New York Times Best Seller\n\n" +
                            "My New Favorite Book all of Time--Bill Gates--\n\n"+
                            "If you think the world is coming to an end, think again: people are living longer, healthier, freer, and happier lives, and while our problems are formidable, the solutions lie in the Enlightenment ideal of using reason and science.\n\n"+
                            "Is the world really falling apart? Is the ideal of progress obsolete? In this elegant assessment of the human condition in the third millennium, cognitive scientist and public intellectual Steven Pinker urges us to step back from the gory headlines and prophecies of doom, which play to our psychological biases. Instead, follow the data: In seventy-five jaw-dropping graphs, Pinker shows that life, health, prosperity, safety, peace, knowledge, and happiness are on the rise, not just in the West, but worldwide. This progress is not the result of some cosmic force. It is a gift of the Enlightenment: the conviction that reason and science can enhance human flourishing.\n\n" +
                            "Far from being a naïve hope, the Enlightenment, we now know, has worked. But more than ever, it needs a vigorous defense. The Enlightenment project swims against currents of human nature--tribalism, authoritarianism, demonization, magical thinking--which demagogues are all too willing to exploit. Many commentators, committed to political, religious, or romantic ideologies, fight a rearguard action against it. The result is a corrosive fatalism and a willingness to wreck the precious institutions of liberal democracy and global cooperation.\n\n"+
                            "With intellectual depth and literary flair, Enlightenment Now makes the case for reason, science, and humanism: the ideals we need to confront our problems and continue our progress.\n\n"
            },
            {
                    "book_h.jpg",
                    "Sustainable Energy",
                    "Without the Hot Air",
                    "David JC MacKay",
                    "384 Pages",
                    "UIT Cambridge Ltd. (February 20,2009)",
                    "English",
                    "9781906860011",
                    "7.5 x 1.1 x 8.8 inches",
                    "2.6 pounds",
                    "Addressing the sustainable energy crisis in an objective manner, this enlightening book analyzes the relevant numbers and organizes a plan for change on both a personal level and an international scale—for Europe, the Untied States, and the world. In case study format, this informative reference answers questions surrounding nuclear energy, the potential of sustainable fossil fuels, and the possibilities of sharing renewable power with foreign countries. While underlining the difficulty of minimizing consumption, the tone remains positive as it debunks misinformation and clearly explains the calculations of expenditure per person to encourage people to make individual changes that will benefit the world at large.\n"
            },
            {
                    "book_i.jpg",
                    "Energy Myths and Realities",
                    "Bringing Science to the Energy Policy Debate",
                    "Vaclav Smil",
                    "232 pages",
                    "AEI Press, 1st edition (August 16, 2010)",
                    "English",
                    "0844743283",
                    "978-08447433288",
                    "6.4 x 0.8 x 9.5 inches",
                    "1.1 pounds",
                    "There are many misconceptions about the future of global energy often presented as fact by the media, politicians, business leaders, activists, and even scientists―wasting time and money and hampering the development of progressive energy policies. Energy Myths and Realities: Bringing Science to the Energy Policy Debate debunks the most common fallacies to make way for a constructive, scientific approach to the global energy challenge.\n\n" +
                            "When will the world run out of oil? Should nuclear energy be adopted on a larger scale? Are ethanol and wind power viable sources of energy for the future? Vaclav Smil advises the public to be wary of exaggerated claims and impossible promises. The global energy transition will be prolonged and expensive―and hinges on the development of an extensive new infrastructure. Established technologies and traditional energy sources are persistent and adaptable enough to see the world through that transition.\n\n"+
                            "Energy Myths and Realities brings a scientific perspective to an issue often dominated by groundless assertions, unfounded claims, and uncritical thinking. Before we can create sound energy policies for the future, we must renounce the popular myths that cloud our judgment and impede true progress.\n"
            },
            {
                    "book_j.jpg",
                    "The Most Powerfull Idea in the World",
                    "A Story of Steam, Industry, and Invention",
                    "William Rosen",
                    "400 pages",
                    "Random House, 1st edition (June 1, 2010)",
                    "English",
                    "1400067057",
                    "978-1400067053",
                    "6.6 x 1.1 x 9.5 inches",
                    "1.6 pounds",
                    "If all measures of human advancement in the last hundred centuries were plotted on a graph, they would show an almost perfectly flat line—until the eighteenth century, when the Industrial Revolution would cause the line to shoot straight up, beginning an almost uninterrupted march of progress.\n\n" +
                            "In The Most Powerful Idea in the World, William Rosen tells the story of the men responsible for the Industrial Revolution and the machine that drove it—the steam engine. In the process he tackles the question that has obsessed historians ever since: What made eighteenth-century Britain such fertile soil for inventors? Rosen’s answer focuses on a simple notion that had become enshrined in British law the century before: that people had the right to own and profit from their ideas.\n\n" +
                            "The result was a period of frantic innovation revolving particularly around the promise of steam power. Rosen traces the steam engine’s history from its early days as a clumsy but sturdy machine, to its coming-of-age driving the wheels of mills and factories, to its maturity as a transporter for people and freight by rail and by sea. Along the way we enter the minds of such inventors as Thomas Newcomen and James Watt, scientists including Robert Boyle and Joseph Black, and philosophers John Locke and Adam Smith—all of whose insights, tenacity, and ideas transformed first a nation and then the world.\n\n" +
                            "William Rosen is a masterly storyteller with a keen eye for the “aha!” moments of invention and a gift for clear and entertaining explanations of science. The Most Powerful Idea in the World will appeal to readers fascinated with history, science, and the hows and whys of innovation itself.\n"
            }

    };

    public static ArrayList<Book> getData() {
        ArrayList<Book> list = new ArrayList<>();
        for (String[] item : data) {
            Book book = new Book();
            book.setPhoto(item[0]);
            book.setTitle(item[1]);
            book.setSubtitle(item[2]);
            book.setAuthor(item[3]);
            book.setHardcover(item[4]);
            book.setPublisher(item[5]);
            book.setLanguage(item[6]);
            book.setIsbn10(item[7]);
            book.setIsbn13(item[8]);
            book.setDimension(item[9]);
            book.setWeight(item[10]);
            book.setReview(item[11]);
            list.add(book);
        }

        return list;
    }
}
