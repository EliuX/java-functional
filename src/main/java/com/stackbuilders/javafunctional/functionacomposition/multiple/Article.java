
package com.stackbuilders.javafunctional.functionacomposition;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
/**
 *
 * @author eliecerhdz
 */
public class Article
{
    final String title;
    
    final String author;
    
    final List<String> tags;
    
    final Date created;

    public Article(String title, String author, String... tags) throws InterruptedException
    {
        this.title = title;
        this.author = author;
        this.tags = Arrays.asList(tags);
        this.created = new Date();
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public List<String> getTags()
    {
        return tags;
    }

    public Date getCreated()
    {
        return created;
    } 
    
    @Override
    public String toString()
    {
        return getTitle();
    } 
}
