
package com.stackbuilders.javafunctional.functionacomposition.multiple;

import com.stackbuilders.javafunctional.functionacomposition.Article;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Try function composition with multiple parameters
 *
 */
public class FunctionCompositionSandBoxMultiple
{

    public static void main(String[] args)
    {
        try
        {
            List<Article> articles = new LinkedList<>();
            articles.add(new Article("The Lord of the Rings", "J. R. R. Tolkien", "fantasy", "drama", "belic", "adventure", "magic"));
            Thread.sleep(100L);
            articles.add(new Article("The Mist", "Stephen King", "science fiction", "drama", "thriller", "horror"));
            Thread.sleep(100L);
            articles.add(new Article("Carrie", "Stephen King", "science fiction", "thriller", "horror"));
            Thread.sleep(100L); 
            articles.add(new Article("End of Watch", "Stephen King", "drama", "science fiction", "thriller", "horror"));
            Thread.sleep(20L);
            articles.add(new Article("Harry Potter", "J. K. Rowling", "fantasy", "war", "epic", "adventure"));
            Thread.sleep(20L);
            articles.add(new Article("A Song of Ice and Fire", "George R. R. Martin", "drama", "epic", "fantasy", "thriller", "horror", "war"));
            Optional<Article> newestDrama = ArticleFilters.newestByTag.apply("drama", articles);
            System.out.println("The newest drama is: " + newestDrama.get());
            System.out.println("Stephen King wrote: ");
            ArticleFilters.byAuthor.apply("Stephen King", articles).forEach(System.out::println);
            Optional<Article> newestStephenKing = ArticleFilters.newestByAuthor.apply("Stephen King", articles); 
            System.out.println("The newest book of Stephen King is: " + newestStephenKing.get());
        }
        catch (InterruptedException ex)
        { 
        }
    }

}
